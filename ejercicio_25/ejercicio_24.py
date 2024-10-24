cadena1 = input("Ingresa la primera cadena: ")
cadena2 = input("Ingresa la segunda cadena: ")
longitudcadena1 = len(cadena1)
longitudcadena2 = len(cadena2)
if longitudcadena1 >= longitudcadena2:
    finalCadena1 = cadena1[-longitudcadena2:]
    if finalCadena1 == cadena2:
        print("Verdadero")
    else:
        print("Falso")
else:
    print("Falso")
