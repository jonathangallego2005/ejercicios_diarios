n = int(input("Ingresa el tamaño de la lista (impar): "))
numeros = []
print("Ingresa los números: ")
for i in range(n):
    numero = int(input())
    numeros.append(numero)
unico = 0 
for i in range(n):
    count = 0 
    for j in range(n):
        if numeros[i] == numeros[j]:
            count += 1
    if count == 1:
        unico = numeros[i]
        break 
print("El número único es: ", unico)
