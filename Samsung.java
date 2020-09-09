
public class Samsung {
   	 private String Empresa;
	 private String modelo;
	 private int botones;
	 private double bocinaFrontal;	//UNIDAD EN db
	 private double bocinaAltas;  	//UNIDAD EN db
	 private String pantalla;		// TIPO PANTALLA
	 private int camaraFrontal;		// UNIDADES mp
	 private int camaraTrasera1;		// UNIDADES mp
	 private int camaraTrasera2;		// UNIDADES mp
	 private double puertoDeCargaUSB;
	 private boolean sensorDEAproximidad;
	 private boolean sensorGiroSensor;
	 private double alto;			//UNIDAD EN mm
	 private double ancho;			//UNIDAD EN mm
	 private double profundida;		//UNIDAD EN mm
	 private double peso;			//UNIDAD EN gr
	 private double precio;
	
	Samsung(String Modelo2){
		Empresa ="Samsung";
		modelo = Modelo2;
		botones = 3;
		bocinaFrontal = 20;
		bocinaAltas = 50;
		pantalla = "LCD";
		camaraFrontal = 15;
		camaraTrasera1 = 50;
		camaraTrasera2 = 60;
		puertoDeCargaUSB = 3.1;
		sensorDEAproximidad = true;
		sensorGiroSensor = true;
		alto =158.3;
		ancho =75.3;
		profundida = 7.6;
		peso = 165;
		precio =5892;
	}


	public String getEmpresa() {
		return Empresa;
	}


	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
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


	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
