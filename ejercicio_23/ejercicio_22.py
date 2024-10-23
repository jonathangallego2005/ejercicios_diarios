cantidad = int(input("Cuántas cadenas vas a ingresar: "))
cadenas = []
for i in range(cantidad):
    cadena = input(f"Ingresa la cadena de texto {i+1}: ")
    cadenas.append(cadena)
resultados = [0] * cantidad
for i in range(cantidad):
    valor_cadena = 0
    cadena = cadenas[i]
    for c in cadena:
        if c != ' ':
            valor_cadena += ord(c) - ord('a') + 1
    resultados[i] = valor_cadena * (i + 1)
for i in range(cantidad):
    print(cadenas[i], "=" ,resultados[i])
