m = int(input("Ingresa el número 1 (la cantidad de veces que se va a multiplicar el número 2): "))
n = float(input("Ingresa el número 2 (el número que se va a multiplicar): "))
multiplo = [0] * m
for i in range(m):
    multiplo[i] = n * (i + 1)
for i in range(m):
    print(multiplo[i])
