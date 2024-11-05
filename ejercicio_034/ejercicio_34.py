a = int(input("Ingresa el primer número (a): "))
b = int(input("Ingresa el segundo número (b): "))
suma = 0
inicio = min(a, b)
fin = max(a, b)
for i in range(inicio, fin + 1):
    suma += i
print("La suma entre", a, "y", b, "es:", suma)
