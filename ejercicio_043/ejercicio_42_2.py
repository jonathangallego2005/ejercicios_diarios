cantidad = 3
datos = []

for i in range(cantidad):
    numero = int(input(f"Ingresa el número {i + 1}: "))
    datos.append(numero)
a = datos[0] * (datos[1] + datos[2])
b = datos[0] * datos[1] * datos[2]
c = datos[0] + datos[1] * datos[2]
d = (datos[0] + datos[1]) * datos[2]
print(f"""Los resultados son:
{a}
{b}
{c}
{d}""")
if (a > b) and (a > c) and (a > d):
    print("El valor máximo que se puede obtener es:", a)
elif (b > a) and (b > c) and (b > d):
    print("El valor máximo que se puede obtener es:", b)
elif (c > a) and (c > b) and (c > d):
    print("El valor máximo que se puede obtener es:", c)
else:
    print("El valor máximo que se puede obtener es:", d)