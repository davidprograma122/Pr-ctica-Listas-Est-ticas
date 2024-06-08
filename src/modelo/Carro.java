package modelo;
/**
 *
 * @author david
 */
public class Carro {
    public class carro {
        private String placa;
        private String marca;
        private String detalleServicio;
        private String cedulaDueño;
        private String color;
        private boolean terminado;

        public carro() {
        }

        public carro(String placa, String marca, String detalleServicio, String cedulaDueño, String color, boolean terminado) {
            this.placa = placa;
            this.marca = marca;
            this.detalleServicio = detalleServicio;
            this.cedulaDueño = cedulaDueño;
            this.color = color;
            this.terminado = terminado;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getDetalleServicio() {
            return detalleServicio;
        }

        public void setDetalleServicio(String detalleServicio) {
            this.detalleServicio = detalleServicio;
        }

        public String getCedulaDueño() {
            return cedulaDueño;
        }

        public void setCedulaDueño(String cedulaDueño) {
            this.cedulaDueño = cedulaDueño;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean getTerminado() {
            return terminado;
        }

        public void setTerminado(boolean terminado) {
            this.terminado = terminado;
        }
        
        
    }
    
}
