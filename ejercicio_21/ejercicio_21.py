s = input("Ingresa la cadena de texto: ")
errores = 0
totalCaracteres = len(s)
for letra in s:
    if letra < 'a' or letra > 'm':
        errores += 1
print(errores,"/",totalCaracteres)
