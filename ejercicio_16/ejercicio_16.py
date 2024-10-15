numeros = []
for i in range(5):
    numero = int(input(f"Ingrese el número {i+1}: "))
    numeros.append(numero)
print("Los números que ingresaste son:", numeros)
mayor = numeros[0]
menor = numeros[0]

for i in range(1, 5):
    if numeros[i] > mayor:
        mayor = numeros[i]
    if numeros[i] < menor:
        menor = numeros[i]
suma = mayor + menor
print("Y la suma del número mayor y el número menor es:", suma)