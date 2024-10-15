numero = [0] * 10
creciente = False
decreciente = False
print("Ingresa números del 1 al 10:")
for i in range(10):
    numero[i] = int(input(f"Ingrese el número {i + 1}: "))
for i in range(9):
    if numero[i] < numero[i + 1]:
        creciente = True
    if numero[i] > numero[i + 1]:
        decreciente = True
if creciente and not decreciente:
    print("Los números que ingresaste están en orden creciente ")
elif decreciente and not creciente:
    print("Los números que ingresaste están en orden decreciente ")
elif decreciente and creciente:
    print("Los números que ingresaste están en desorden ")
else:
    print("Los números que ingresaste todos son iguales ")