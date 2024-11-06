cantidad = int(input("Ingresa la cantidad de números triangulares que va a ingresar: "))
numeros = []
for i in range(cantidad):
    numero = int(input(f"Ingrese el número {i + 1}: "))
    numeros.append(numero)
for numero in numeros:
    resultado = 0
    if numero > 0:
        resultado = numero * (numero + 1) // 2
    print("El ", numero, " número triangular es: ", resultado)