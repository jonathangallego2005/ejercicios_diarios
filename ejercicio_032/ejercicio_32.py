cantidad = int(input("Cuántos números tiene la cadena (mínimo 4): "))
if cantidad < 4:
    print("Debe ingresar al menos 4 números.")
else:
    numeros = []
    for i in range(cantidad):
        numero = int(input(f"Ingrese el número {i + 1}: "))
        numeros.append(numero)
    numeros.sort()
    resultado = numeros[0] + numeros[1]
    print("La suma de los dos números más bajos es:", resultado)
