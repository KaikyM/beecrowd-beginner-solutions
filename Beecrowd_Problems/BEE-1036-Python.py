import math
A, B, C = map(float, input().split())
#
Delta = (B**2) - (4*A*C)
Div = 2*A
#
if Delta >= 0 and Div != 0:
    X1 = (-B + Delta**(1/2))/Div
    X2 = (-B - Delta**(1/2))/Div
    print("R1 = %.5f" %(X1))
    print("R2 = %.5f" %(X2))
else:
    print("Impossivel calcular")
