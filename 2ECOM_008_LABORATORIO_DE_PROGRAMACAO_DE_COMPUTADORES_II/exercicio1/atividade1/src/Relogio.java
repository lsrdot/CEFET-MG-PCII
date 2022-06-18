// Aluno: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
// 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II

public class Relogio {

    private Contador hora;
    private Contador minuto;
    private String displayFormatado;
    private boolean formato24h;
    int temp = 0;

   public Relogio() {
        this.hora = new Contador(0,24);
        this.minuto = new Contador(0,60);
        this.displayFormatado = "";
   }

    public Relogio(Contador hora, Contador minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.displayFormatado = this.hora.getValor() + ":" + this.minuto.getValor();
    }

    public void ticTac() {
        this.minuto.incrementar();
        if(this.minuto.getValor() == 0) {
            this.hora.incrementar();
        }
    }

    public Contador getHora() {
        return hora;
    }

    public void setHora(Contador hora) {
        this.hora = hora;
    }

    public Contador getMinuto() {
        return minuto;
    }

    public void setMinuto(Contador minuto) {
        this.minuto = minuto;
    }

    public String getDisplayFormatado() {
        if(this.formato24h) {
            if (this.hora.getValor() < 10 && this.minuto.getValor() < 10) {
                return this.displayFormatado = "0" + this.hora.getValor() + ":" + "0" + this.minuto.getValor();
            } else if (this.hora.getValor() < 10) {
                return this.displayFormatado = "0" + this.hora.getValor() + ":" + this.minuto.getValor();
            } else if (this.minuto.getValor() < 10) {
                return this.displayFormatado = this.hora.getValor() + ":" + "0" + this.minuto.getValor();
            } else {
                return this.displayFormatado = this.hora.getValor() + ":" + this.minuto.getValor();
            }
        } else {

            String aPm = " a.m.";

            if(temp == 0) {
                atualizaDisplay(aPm);
                return displayFormatado;
            } else {
                aPm = " p.m.";
                atualizaDisplay(aPm);
                return displayFormatado;
            }
        }
    }


    private void atualizaDisplay(String aPm) {
       if(((this.hora.getValor() == 0) && (this.minuto.getValor() == 0))) {
           aPm = " a.m.";
       }
       if(temp == 0 || (this.hora.getValor() == 12) || ((this.hora.getValor() == 0) && (this.minuto.getValor() == 0))) {
           if ((this.hora.getValor() % 13) < 10 && this.minuto.getValor() < 10) {
               this.displayFormatado = "0" + (this.hora.getValor() % 13) + ":" + "0" + this.minuto.getValor() + aPm;
           } else if ((this.hora.getValor() % 13) < 10) {
               this.displayFormatado = "0" + (this.hora.getValor() % 13) + ":" + this.minuto.getValor() + aPm;
           } else if ((this.minuto.getValor()) < 10) {
               this.displayFormatado = (this.hora.getValor() % 13) + ":" + "0" + this.minuto.getValor() + aPm;
           } else {
               this.displayFormatado = (this.hora.getValor() % 13) + ":" + this.minuto.getValor() + aPm;
           }
       } else {
           if ((this.hora.getValor() % 12) < 10 && this.minuto.getValor() < 10) {
               this.displayFormatado = "0" + ((this.hora.getValor() % 13) + 1) + ":" + "0" + this.minuto.getValor() + " p.m.";
           } else if ((this.hora.getValor() % 12) < 10) {
               this.displayFormatado = "0" + ((this.hora.getValor() % 13) + 1) + ":" + this.minuto.getValor() + " p.m.";
           } else if ((this.minuto.getValor()) < 10) {
               this.displayFormatado = ((this.hora.getValor() % 13) + 1) + ":" + "0" + this.minuto.getValor() + " p.m.";
           } else {
               this.displayFormatado = ((this.hora.getValor() % 13) + 1)  + ":" + this.minuto.getValor() + " p.m.";
           }
       }
        if (this.hora.getValor() == 11 && this.minuto.getValor() == 59) {
            temp++;
        }
    }


    public void setDisplayFormatado(String displayFormatado) {
        this.displayFormatado = displayFormatado;
    }

    public boolean isFormato24h() {
        return formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }


}
