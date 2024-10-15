numeros = []
for i in range(5):
    numeros.append(int(input("Ingresa el número: ")))
print("Los números son: ", numeros)
multiplicacion = 1  
for num in numeros:
    multiplicacion *= num
print("El resultado de la multiplicación es: ", multiplicacion)
