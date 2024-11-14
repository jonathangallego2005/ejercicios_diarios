cantidad = int(input("Ingresa la cantidad de números que tendrá tu matriz: "))
numeros = []
print("Ingresa la mayoría de los números iguales (sino te saldrá un error)")
for i in range(cantidad):
    numero = int(input(f"Ingresa el número {i + 1}: "))
    numeros.append(numero)
diferente = 0
if numeros[0] == numeros[1]:
    for i in range(2, cantidad):
        if numeros[i] != numeros[0]:
            diferente = numeros[i]
            break
else:
    diferente = numeros[1] if numeros[0] == numeros[2] else numeros[0]
print("El número diferente es:", diferente)
