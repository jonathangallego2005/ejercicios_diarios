cadena = input("Ingresa la cadena: ")
complemento = ""
for simbolo in cadena:
    if simbolo == 'A':
        complemento += 'T'
    elif simbolo == 'T':
        complemento += 'A'
    elif simbolo == 'C':
        complemento += 'G'
    elif simbolo == 'G':
        complemento += 'C'
print("Cadena complementaria:", complemento)
