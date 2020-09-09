
public class TelefonoUsuario {

	public static void main(String[] args) {
		
       Huawei Huawei = new Huawei("RM_90");
      
       //Telefono modelo Huawei RM_90
       System.out.println(Huawei.getEmpresa() +" " +Huawei.getModelo());
       System.out.println("---------");

      Huawei.setCamaraFrontal(16);
      Huawei.setCamaraTrasera1(25);
      Huawei.getBotones();
      Huawei.getPantalla();
      Huawei.setAlto(158);
      Huawei.setAncho(75);
      Huawei.setProfundida(7);
      Huawei.setBocinaFrontal(75);
      Huawei.getSensorDEAproximidad();
      Huawei.getSensorGiroSensor();
      Huawei.setPeso(166);
      
      
      System.out.println("Camara Fontal = " + Huawei.getCamaraFrontal());
      System.out.println("Camara trasera = " + Huawei.getCamaraTrasera1());
      System.out.println("Bontones = " + Huawei.getBotones());
      System.out.println("Pantalla = " + Huawei.getPantalla());
      System.out.println("Alto = " + Huawei.getAlto());
      System.out.println("Ancho = " + Huawei.getAncho());
      System.out.println("Profundidad = " + Huawei.getProfundida());
      System.out.println("Bocinas Frontales  = " + Huawei.getBocinaFrontal());
      System.out.println("Sensor de aproximidad  = " + Huawei.getSensorDEAproximidad());
      System.out.println("Sensor de giro = " + Huawei.getSensorGiroSensor());
      System.out.println("Peso = " + Huawei.getPeso());
      System.out.println("");
      
      //Telefono modelo Samsung  P20
      
      System.out.println("");
      Samsung  Samsung = new Samsung ("P90");
      
      System.out.println(Samsung.getEmpresa()+" " +Samsung.getModelo());
      System.out.println("*************");
      
      Samsung.setCamaraFrontal(16);
      Samsung.setCamaraTrasera1(20);
      Samsung.getBotones();
      Samsung.getPantalla();
      Samsung.setAlto(72);
      Samsung.setAncho(74 );
      Samsung.setProfundida(8);
      Samsung.setBocinaFrontal(78);
      Samsung.getSensorDEAproximidad();
      Samsung.getSensorGiroSensor();
      Samsung.setPeso(165);
      Samsung.getPrecio();
      
      System.out.println("Camara Fontal = " +  Samsung.getCamaraFrontal());
      System.out.println("Camara trasera = " +  Samsung.getCamaraTrasera1());
      System.out.println("Bontones = " +  Samsung.getBotones());
      System.out.println("Pantalla = " +  Samsung.getPantalla());
      System.out.println("Alto = " +  Samsung.getAlto());
      System.out.println("Ancho = " +  Samsung.getAncho());
      System.out.println("Profundidad = " +  Samsung.getProfundida());
      System.out.println("Bocinas Frontales  = " +  Samsung.getBocinaFrontal());
      System.out.println("Sensor de aproximidad  = " +  Samsung.getSensorDEAproximidad());
      System.out.println("Sensor de giro = " +  Samsung.getSensorGiroSensor());
      System.out.println("Peso = " +  Samsung.getPeso());
      System.out.println("Precio = " +  Samsung.getPrecio());
      
	}	

	

}
