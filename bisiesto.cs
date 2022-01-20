Console.WriteLine("calcular bisiesto \n");
Console.WriteLine("año a calcular \n");
string year = Console.ReadLine();
int a = Convert.ToInt32(year);
if (Convert.ToInt32(year) % 4 == 0 && Convert.ToInt32(year) % 100 != 0 || Convert.ToInt32(year) % 400 == 0)
{
    Console.WriteLine("Es bisiesto {0}\n",year);
}
else
{
    Console.WriteLine("no es bisiesto {0} \n", year);
}
Console.ReadKey();
