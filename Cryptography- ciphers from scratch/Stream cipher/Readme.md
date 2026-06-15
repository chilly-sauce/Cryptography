Stream Cipher opearate on bits in this we use xor operation.

fxn for encryption-
y(i) = x(i) + S(i) mod 2

fxn for decryption-
x(i) = y(i) + S(i) mod 2

we use same key for encryption and decryption performing xor operation.
lets say bit is 74 and key is 99
enc code will be 74^99
to decrypt it we again perform xor 74^99^99
as we know a^a =1
so 74^99^99=77^1=77 hence obtaining the initial message.

its theoretically secure as long as key is random and only used once.

if we use same key to encrypt two letters,
we can apply xor on them which eliminates the key and xor of two letters can be easily found out.
