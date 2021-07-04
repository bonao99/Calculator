import java.util.Scanner;

public class Calculator {
	
	
	
	
	private static float devuelta(float amountPagado, float compraDeHoy)
	{
		 
		float devuelta = amountPagado - compraDeHoy;
		return devuelta;
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		float bill2000 = 2000;
		float bill1000 = 1000;
		float bill500 = 500;
		float bill200 = 200;
		float bill100 = 100;
		float bill50 = 50;
		float bill20 = 20;
		float bill10 = 10;
		float bill5 = 5;
		float bill1 = 1;
		float compra, pago = 45;
		
	 
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter amount : ");
		float amountPagado = input.nextFloat();
		pago = amountPagado;
		
		System.out.println("amount pagado = " + amountPagado);
		
		Scanner compraDeHoy = new Scanner(System.in);
		System.out.println("compras de hoy = " + compraDeHoy);
		float totaldeCompras = compraDeHoy.nextFloat();
		compra = totaldeCompras;
		
		float devueltaDeCaja = devuelta(pago, compra);
		
		
		System.out.println("Devuelta a devolver " + devueltaDeCaja);
		

		
		
		if(devueltaDeCaja < 0 || devueltaDeCaja > 100000)
		{
			System.out.println("Amount not accepted ");
			return;
			
		}
		
		if(devueltaDeCaja >= 2000)
			
		{
			System.out.println("Dev = " + bill2000);
			bill2000 = devueltaDeCaja / 2000;
			devueltaDeCaja = devueltaDeCaja - (bill2000 * 2000);
			
			System.out.println("Dev = " + bill2000);
		}
		
		
		if(devueltaDeCaja >= 1000)
			
		{
			System.out.println("Dev = " + 	bill1000);
			bill1000 = devueltaDeCaja / 2000;
			devueltaDeCaja = devueltaDeCaja - (bill1000 * 2000);
			
			System.out.println("Dev = " + bill1000);
		}
		
		
		

		

	}

}
