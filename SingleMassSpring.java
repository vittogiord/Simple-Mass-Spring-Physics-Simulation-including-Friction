package phyisicsSimulationsPackage;

public class SingleMassSpring
{
	public static void mainSingleSpring()
	{
		char[] oneDimensionalSpace= new char[100];
		
		double equilibriumPoint= 50;
		double initialStretch= 48.5;
		double actualPosition= equilibriumPoint-initialStretch;
		
		double mass= 1.5;
		double elasticConstant= 35;
		
		double frictionCoefficient= 0.8;
		double frictionForce= -mass*frictionCoefficient*9.81;
		
		double totalTimeOfMotion= 2*Math.PI*Math.sqrt(mass/elasticConstant);
		double basicTimeUnit= 0.02;
		
		double velocity= 0;
		
		int numbersOfTurns= 8;
		if(elasticConstant*(equilibriumPoint-actualPosition)>frictionForce)
			for(int i= 1; basicTimeUnit*i<=totalTimeOfMotion*numbersOfTurns; i++)
			{
				actualPosition= actualPosition+velocity*basicTimeUnit+0.5*((elasticConstant*(equilibriumPoint-actualPosition))+frictionForce)/mass*basicTimeUnit*basicTimeUnit;
				
				int posizioneAttualeInt= (int) Math.round((actualPosition*1.0)/1.0);
				for(int j= 0; j<oneDimensionalSpace.length; j++)
				{
					if(j<posizioneAttualeInt)
						oneDimensionalSpace[j]= '/';
					else if(j==posizioneAttualeInt)
						oneDimensionalSpace[j]= 'O';
					else
						oneDimensionalSpace[j]= '_';
					System.out.print(oneDimensionalSpace[j]);
				}
				
				System.out.print("    t= ");
				System.out.print(Math.round((basicTimeUnit*i)*1000.0)/1000.0);
				System.out.print(" s;    s= ");
				System.out.print(Math.round(actualPosition*1000.0)/1000.0);
				System.out.print(" m;    v= ds/dt= ");
				System.out.print(Math.round(velocity*1000.0)/1000.0);
				System.out.print(" m/s;    a= d^2s/dt^2= ");
				System.out.print(Math.round(((elasticConstant*(equilibriumPoint-actualPosition))+frictionForce)*1000.0)/1000.0);
				System.out.print(" m/(s^2);    K= ");
				System.out.print(Math.round(mass*(0.5)*velocity*velocity*1000.0)/1000.0);
				System.out.print(" J;    U= ");
				System.out.print(Math.round(elasticConstant*(equilibriumPoint-actualPosition)*(equilibriumPoint-actualPosition)*(0.5)*1000.0)/1000.0);
				System.out.print(" J;    EM= ");
				System.out.print(Math.round((((elasticConstant*(equilibriumPoint-actualPosition))*(equilibriumPoint-actualPosition)*(0.5))+(mass*1/2*velocity*velocity))*1000.0)/1000.0);	
				System.out.print(" J\n");
				
				velocity= velocity+basicTimeUnit*(((elasticConstant*(equilibriumPoint-actualPosition))+frictionForce)/mass);
				frictionForce= velocity/Math.abs(velocity)*(-1)*Math.abs(frictionForce);
			}
	}
}
