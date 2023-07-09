# maths-problem-solving-code
The python code to solve various problems in maths

1.Solution of algebraic and transdental equation by Regular Falsi Method:
from sympy import*
x=Symbol('x')
g=input('Enter the function:') ##for the given function entering
f=lambdify(x,g)
a=float(input('Enter the value:')) ##enter first root a
b=float(input('Enter the value;')) ##enter second root b
N=int(input('Enter number of iterations:')) #the iteration probable required
for i in range(1,N+1):
  c=(a*f(b)-b*f(a))/(f(b)-f(a))
  if ((f(a)*f(c)<0)):
    b=c
  else:
    a=c
  print('iteration %d\t the root %0.3f\t functional value %0.3f\n'%(i,c,f(c)));
print('Final value of root is %0.3f'%c)
