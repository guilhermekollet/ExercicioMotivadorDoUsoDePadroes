public class Motor {

    private TipoCombustivel tipoGasolina;
    private TipoCombustivel tipoAlcool;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoGasolina = tipoMotor;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoGasolina;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / consumo;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        switch (tipoAlcool) {
            case ALCOOL:
                return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoAlcool + "]";
        
            case FLEX:
                return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoGasolina + " ou " + tipoAlcool + "]";
            
            case DIESEL:
                return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoAlcool + "]";
            
            case GASOLINA:
                return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoGasolina + "]";  
            
            default:
                break;
        }
        return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoGasolina + "]";
    }
}