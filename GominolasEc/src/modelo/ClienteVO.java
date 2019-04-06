
package modelo;

public class ClienteVO extends PersonaVO{
    private String ci;

    public ClienteVO(String ci) {
        this.ci = ci;
    }
    public ClienteVO() {
        this.ci = "";
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
}
