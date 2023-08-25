A, B, C = map(float, input().split())
#
if A < B + C and B < C + A and C < A + B:
    triangle = A + B + C;
    print("Perimetro = %.1f" %(triangle));
else:
    trapezium = ((A + B)*C) / 2;
    print("Area = %.1f" %(trapezium));
