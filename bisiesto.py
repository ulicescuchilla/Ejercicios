# coding:utf-8
year = int(input("Indique el año a consultar: "))

if (year % 4) == 0:
    if(year % 100) == 0:
        if (year % 400) == 0:
            print("\n{0} es un año bisiesto".format(year))
        else:
            print("\n{0} no es un año bisiesto".format(year))
    else:
        print("\n{0} es un año bisiesto".format(year))
else:
    print("\n{0} no es un año bisiesto".format(year))
