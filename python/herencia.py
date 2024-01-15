class Persona:
   def __init__(self, nombre, edad, nacionalidad):
       self.nombre = nombre
       self.edad = edad
       self.nacionalidad = nacionalidad

   def hablar(self):  
       print("Hola, estoy hablando un poco")

class Empleado(Persona):
   def __init__(self, nombre, edad, nacionalidad,trabajo,salario,):
      super().__init__(nombre, edad, nacionalidad)
      self.salario=salario
      self.trabajo=trabajo


class Estudiante(Persona):
   def __init__(self, nombre, edad, nacionalidad, notas, universidad):
       super().__init__(nombre, edad, nacionalidad)  
       self.notas = notas
       self.universidad = universidad


roberto=Empleado("roberto",43,"argentino","programador",10000)

roberto.hablar()
