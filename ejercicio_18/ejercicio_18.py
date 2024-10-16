matriz = [0] * 5 
for i in range(5):
    matriz[i] = int(input(f"Ingresa el número {i + 1}: "))
for i in range(len(matriz)):
    matriz[i] = matriz[i] * 2
for valor in matriz:
    print(valor, end=" ") 