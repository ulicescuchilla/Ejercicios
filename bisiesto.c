#include <stdio.h>

int esBisiesto(long year)
{
    // Divisible entre 4, y (NO divisible entre 100 o divisible entre 400)
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
}

int main()
{
    long year;
    // Pequeño uso:
    printf("Ingresa un año: ");
    scanf("%ld", &year);
    int resultado = esBisiesto(year);
    if (resultado)
    {
        printf("Es bisiesto\n");
    }
    else
    {
        printf("NO es bisiesto\n");
    }
    return 0;
}
