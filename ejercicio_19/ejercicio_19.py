letra = input("Ingresa varias letras o una cadena de letras: ")
resultado = ""
for i in range(len(letra)):
    caracter = letra[i]
    resultado += caracter.upper()
    for j in range(i):
        resultado += caracter.lower()
    if i < len(letra) - 1:
        resultado += "-"
print(resultado)
