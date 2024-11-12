inicio = int(input("Ingresa el número de inicio: "))
fin = int(input("Ingresa el número final: "))
for i in range(inicio, fin + 1):
    if '5' in str(i):
        continue      
    print(i)


# ¡No me des cinco!
# En este kata se obtiene el número de inicio y el número final de una región y se debe devolver el recuento de todos los números excepto los que contienen un 5. ¡El número de inicio y el número final son ambos inclusivos!

# Ejemplos:

# 1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
# 4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
# El resultado puede contener cincos. ;-)
# El número inicial siempre será menor que el número final. ¡Ambos números también pueden ser negativos!