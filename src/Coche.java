
public class Coche {

	public int velocidad;

	public void acelerar_APG(int aceleracion) {
		velocidad +=aceleracion;
	}


	public void decelerar_APG(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad <0) {
			velocidad = 0;
		}
	}
}
