def is_armstrong(n: int) -> bool:
  """Return True if n is an Armstrong number (non-negative integers only)."""
  if n < 0:
    return False
  digits = [int(d) for d in str(n)]
  power = len(digits)
  return n == sum(d ** power for d in digits)


def main():
  s = input("Enter a non-negative integer: ").strip()
  try:
    n = int(s)
  except ValueError:
    print("Invalid input: please enter an integer.")
    return

  if is_armstrong(n):
    print(f"{n} is an Armstrong number.")
  else:
    print(f"{n} is not an Armstrong number.")


if __name__ == "__main__":
  main()