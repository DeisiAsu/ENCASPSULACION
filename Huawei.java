
public class Huawei {
	private String empresa;
	private String modelo;
	private int botones;
	private double bocinaFrontal;	
	private double bocinaAltas;  	
	private String pantalla;
	private int camaraFrontal;		
	private int camaraTrasera1;		
	private int camaraTrasera2;		
	private double puertoDeCargaUSB;
	private boolean sensorDEAproximidad;
	private boolean sensorGiroSensor;
	private double alto;			
	private double ancho;			
	private double profundida;		
	private double peso;			
	

	Huawei(String nuevoModelo){
		empresa ="Huawei";
		modelo = nuevoModelo;		
		botones = 4;
		bocinaFrontal = 100;
		bocinaAltas = 500;
		pantalla = "LCD";
		camaraFrontal = 12;
		camaraTrasera1 = 30;
		camaraTrasera2 = 40;
		puertoDeCargaUSB = 3.1;
		sensorDEAproximidad = true;
		sensorGiroSensor = true;
		alto =158.3;
		ancho =75.3;
		profundida = 7.6;
		peso = 165;
	}

	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getBotones() {
		return botones;
	}


	public void setBotones(int botones) {
		this.botones = botones;
	}


	public double getBocinaFrontal() {
		return bocinaFrontal;
	}


	public void setBocinaFrontal(double bocinaFrontal) {
		this.bocinaFrontal = bocinaFrontal;
	}


	public double getBocinaAltas() {
		return bocinaAltas;
	}


	public void setBocinaAltas(double bocinaAltas) {
		this.bocinaAltas = bocinaAltas;
	}


	public String getPantalla() {
		return pantalla;
	}


	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}


	public int getCamaraFrontal() {
		return camaraFrontal;
	}


	public void setCamaraFrontal(int camaraFrontal) {
		this.camaraFrontal = camaraFrontal;
	}


	public int getCamaraTrasera1() {
		return camaraTrasera1;
	}


	public void setCamaraTrasera1(int camaraTrasera1) {
		this.camaraTrasera1 = camaraTrasera1;
	}


	public int getCamaraTrasera2() {
		return camaraTrasera2;
	}


	public void setCamaraTrasera2(int camaraTrasera2) {
		this.camaraTrasera2 = camaraTrasera2;
	}


	public double getPuertoDeCargaUSB() {
		return puertoDeCargaUSB;
	}


	public void setPuertoDeCargaUSB(double puertoDeCargaUSB) {
		this.puertoDeCargaUSB = puertoDeCargaUSB;
	}


	public boolean getSensorDEAproximidad() {
		return sensorDEAproximidad;
	}


	public void setSensorDEAproximidad(boolean sensorDEAproximidad) {
		this.sensorDEAproximidad = sensorDEAproximidad;
	}


	public boolean getSensorGiroSensor() {
		return sensorGiroSensor;
	}


	public void setSensorGiroSensor(boolean sensorGiroSensor) {
		this.sensorGiroSensor = sensorGiroSensor;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getProfundida() {
		return profundida;
	}


	public void setProfundida(double profundida) {
		this.profundida = profundida;
	}


	public double getPeso() {
		return peso;
	}
}
