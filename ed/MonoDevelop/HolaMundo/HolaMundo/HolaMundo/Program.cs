using System;

namespace HolaMundo
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine("Introduce tu nombre:");
            String nombre = Console.ReadLine();
            Console.WriteLine("Hola " + nombre);

            Console.WriteLine("Dime tu edad: ");
            int edad = int.Parse(Console.ReadLine());
            Console.WriteLine(nombre + " tu edad es " + edad);

            Console.WriteLine(nombre + " dime un numero:");
            double numero1 = double.Parse(Console.ReadLine());
            Console.WriteLine("dime otro numero: ");
            double numero2 = double.Parse(Console.ReadLine());
            Console.WriteLine("La suma es " + (numero1 + numero2));
            Console.WriteLine("La resta es " + (numero1 - numero2));
            Console.WriteLine("La multiplicacion es " + (numero1 * numero2));
            Console.WriteLine("La division es " + (numero1 / numero2));
        }
    }
}
