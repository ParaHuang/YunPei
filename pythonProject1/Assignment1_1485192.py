"""
Assignment 1 — Practice Questions (Q1–Q40)
Each question is a standalone function with parameters and a return value for easy verification.
For every function you’ll find a concise but in‑depth docstring specifying:
- Purpose and expected behavior
- Parameters with types and assumptions
- Small examples (doctest-style) students can try
- The first 10 sample functions are provided for your reference with no mark awarded
- StudentAssertion.py is available for testing.
- Refer to StudentAssertion.py for the testing input and expected return value(s).
- No additional import packages are allowed. Zero marks will be awarded if additional package(s) are found even it is not in use

NOTE: Another script with different test cases and values will be used to automark your assignment.
    : Make sure you adhere to the StudentAssertion.py format, do not change the code in StudentAssertion.py to suits your answer.
    : Failure to run your submission with the orignal StudentAssertion.py will result in a zero marks.

Message to Students
This assignment is designed to help you revise and become confident with essential Python syntax and problem‑solving. 
While we understand that AI tools can generate answers quickly, your learning comes from attempting each question on your own first.
Please remember:
- Your final exam is handwritten, closed‑book, with no laptop, no IDE, and no AI assistance.
- That means your ability to write Python code from your own understanding is absolutely critical.
- You may score full marks for the assignment with external help, but if you score below 40 marks on the final exam, 
- you will fail the module and will have to repeat it. 
- Copying answers now might feel convenient, but it will not help you when it matters most.
- So, give yourself the chance to truly learn.
- Attempt every question independently first, then use AI only to check, compare, or refine your solution.
- Do it right the first time, your future self will thank you.
- There might be some algorithms that you have come across the first time (e.g. BFS and Levenshtein edit distance)
    - Google or use ChatGPT and do a bit of reading and research on those algorithms.
    - It never hurts to hurt your brain a little. 
    - Brain is like muscle, it only starts to grow when it hurts (neuroplasticity).
    - https://theconversation.com/your-brain-can-be-trained-much-like-your-muscles-a-neurologist-explains-how-to-boost-your-brain-health-271331
    - https://www.psychologytoday.com/us/blog/curiosity-code/202504/why-great-thinking-is-supposed-to-make-your-brain-hurt
"""

# Sample 1: Return True if n is even, else False
# (Provided format reference)
def S1(n):
    """Return True if the integer *n* is even, else False.

    Parameters
    ----------
    n : int
        Any integer (positive, zero, or negative).

    Returns
    -------
    bool
        True if n % 2 == 0, otherwise False.
    """
    return n % 2 == 0

# Sample 2: Return "positive", "negative", or "zero" based on the integer n
def S2(n):
    """Classify an integer as "positive", "negative", or "zero".

    Parameters
    ----------
    n : int

    Returns
    -------
    str
        One of {"positive", "negative", "zero"}.
    """
    if n > 0:
        return "positive"
    elif n < 0:
        return "negative"
    else:
        return "zero"

# Sample 3: Return "adult" if age >= 18, otherwise "minor"
def S3(age):
    """Decide legal adulthood using a simple threshold (>= 18).

    Parameters
    ----------
    age : int
        Assumed non-negative.

    Returns
    -------
    str
        "adult" if age >= 18, otherwise "minor".
    """
    if age >= 18:
        return "adult"
    else:
        return "minor"

# Sample 4: Return the larger of a and b; if they are equal, return "equal"
def S4(a, b):
    """Return the larger value or the string "equal" if *a == b*.

    Works for any comparable numeric types.
    """
    if a > b:
        return a
    elif b > a:
        return b
    else:
        return "equal"

# Sample 5: Return "pass" if score >= 50, otherwise "fail"
def S5(score):
    """Simple pass/fail threshold at 50 (inclusive)."""
    if score >= 50:
        return "pass"
    else:
        return "fail"

# Sample 6: Sum of all integers from 1 to n using a while loop
# Assume n >= 0. If n == 0, return 0.
def S6(n):
    """Compute 1 + 2 + ... + n using a while loop.

    Edge cases: n == 0 -> 0.
    """
    total = 0
    i = 1
    while i <= n:
        total += i
        i += 1
    return total

# Sample 7: Reverse a string using a while loop
def S7(s):
    """Return the reverse of *s* using manual indexing (while loop).

    Works with empty strings.
    """
    i = len(s) - 1
    out = []
    while i >= 0:
        out.append(s[i])
        i -= 1
    return "".join(out)

# Sample 8: Count the number of digits in a non-negative integer n using a while loop (0 has 1 digit)
def S8(n):
    """Count decimal digits of a non-negative integer.

    Special case: Q10(0) == 1.
    """
    if n == 0:
        return 1
    count = 0
    while n > 0:
        n //= 10
        count += 1
    return count

# Sample 9: Sum of even numbers from 1 to n (inclusive) using a for loop
def S9(n):
    """Sum the even integers between 1 and n inclusive using a for loop."""
    total = 0
    for i in range(2, n + 1, 2):
        total += i
    return total

# Sample 10: Return a new list containing the squares of each number
def S10(nums):
    """Square each number from *nums* and return a new list in order."""
    out = []
    for x in nums:
        out.append(x * x)
    return out

#################################################################################
#Replace pass in each function with your code
#################################################################################
def Q1(year):
    """
    Determine whether a given year is a leap year in the Gregorian calendar.

    Parameters
    ----------
    year : int
        Any integer year.

    Returns
    -------
    bool
        True if leap year, else False.
    """
    if year % 400 == 0 or (year % 100 != 0 and year % 4 == 0):
        return True
    else:
        return False

def Q2(n):
    """
    Compute factorial of n using a while loop.

    Parameters
    ----------
    n : int
        Non-negative integer.

    Returns
    -------
    int
        n factorial.
    """

    if n < 0:
        return "negative"
    elif n == 0:
        return 1

    i = 1
    result = 1
    while i <= n:
        if n > 0:
            result *= i
            i += 1
    return result

def Q3(a, b):
    """
    Compute the GCD of two non-negative integers using Euclid's algorithm.
    """
    if b == 0:
        return a
    else:
        return Q3(b, a%b)

def Q4(s):
    """
    Count vowels in a string (case-insensitive).
    """
    count = 0
    for n in s:
        if n in "aeiouAEIOU":
            count +=1
        else:
            count += 0
    return count

def Q5(items, target, k):
    """
    Return True if target appears at least k times.
    """
    if items.count(target) >= k :
        return True
    else:
        return False

def Q6(n):
    """
    Construct a hyphen-separated string containing the integers from 1 to n.

    Parameters
    ----------
    n : int
        A non-negative integer.

    Returns
    -------
    str
        A string formatted as "1-2-3-...-n". Returns an empty string if n == 0.
    """
    if n == 0:
        return ""
    result = []
    for i in range(1, n + 1):
        result.append(str(i))
    return "-".join(result)



def Q7(nums):
    """
    Return a list containing only the even integers from nums.

    Parameters
    ----------
    nums : list[int]
        List of integers.

    Returns
    -------
    list[int]
        Even numbers in the same order as input.
    """
    result = []
    for i in nums:
        if i % 2 == 0:
            result.append(i)
    return result

def Q8(items, target):
    """
    Return the index of the first occurrence of target in items.

    Parameters
    ----------
    items : list
        List of elements.
    target : any
        Value to search for.

    Returns
    -------
    int
        Index of first occurrence, or -1 if not found.
    """
    for n in range(len(items)):
        if items[n] == target:
            return n
    return -1

def Q9(nums):
    """
    Compute the arithmetic mean of nums.

    Parameters
    ----------
    nums : list[int | float]
        List of numbers.

    Returns
    -------
    float or None
        Mean value, or None if nums is empty.
    """
    if not nums:
        return None
    ave = sum(nums)/len(nums) 
    return ave


def Q10(words):
    """
    Map each string in words to its length.

    Parameters
    ----------
    words : list[str]
        List of strings.

    Returns
    -------
    list[int]
        Corresponding lengths.
    """
    length = []
    for x in words:
        length.append( len(x))
    return length


def Q11(nums, n):
    """
    Rotate nums to the right by n steps.

    Parameters
    ----------
    nums : list
        Input list.
    n : int
        Number of right rotations.

    Returns
    -------
    list
        Rotated list.
    """
    if not nums :
        return []
    n = n % len(nums)
    result = nums[:]
    for i in range(n):
        result = [result[-1]] + result[:-1]
    return result

def Q12(prices, cart):
    """
    Compute the total cost of items in cart based on prices.

    Parameters
    ----------
    prices : dict
        Mapping item → price.
    cart : list
        Items to total.

    Returns
    -------
    int or float
        Total price.
    """
    total = 0
    for item in cart:
        total += prices.get(item,0)
    return total


def Q13(items):
    """
    Count frequencies of each element in items.

    Parameters
    ----------
    items : list
        Input list.

    Returns
    -------
    dict
        Mapping element → count.
    """
    dic = {}
    for i in items:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    return dic


def Q14(a, b):
    """
    Merge dictionaries a and b, values from b overwrite a.

    Parameters
    ----------
    a : dict
        First dictionary.
    b : dict
        Second dictionary.

    Returns
    -------
    dict
        Merged dictionary.
    """
    # dic1 = {}
    # for key, value in a.items():
    #     dic1[key] = value
    # for key, value in b.items():
    #     dic1[key] = value
    # return dic1
    # ** get the key:value from dict
    # {} create a new dict
    return  {**a,**b}


def Q15(scores):
    """
    Compute average score per student.

    Parameters
    ----------
    scores : dict[str, list[int]]
        Mapping student → list of scores.

    Returns
    -------
    dict[str, float | None]
        Average score per student, None if no scores.
    """
    dic2 = {}
    for key, value in scores.items():
        if len(value) == 0:
            dic2[key] = None
        else:
            dic2[key] = sum(value) / len(value)
    return dic2


def Q16(d):
    """
    Invert a dictionary mapping key → value into value → key.
    If duplicate values exist, the first key encountered is kept.

    Parameters
    ----------
    d : dict
        Dictionary to invert.

    Returns
    -------
    dict
        Inverted dictionary.
    """
    dic3 = {}
    for key, value in d.items():
        if value not in dic3:
            dic3[value] = key
    return dic3


def Q17(base, exp, mod):
    """
    Compute (base ** exp) % mod using fast modular exponentiation.

    Parameters
    ----------
    base : int
        Base value.
    exp : int
        Non-negative exponent.
    mod : int
        Positive modulus.

    Returns
    -------
    int
        (base ** exp) % mod.
    """
    return pow(base,exp,mod)


def Q18(a, b, c):
    """
    Solve the quadratic equation ax^2 + bx + c = 0 for real roots.
    If a = 0, treat as linear.

    Parameters
    ----------
    a, b, c : float
        Coefficients of the equation.

    Returns
    -------
    tuple
        Real roots sorted ascending, or empty tuple if none.
    """
    if a == 0 and b == 0:
        return ()
    elif a == 0 and b != 0:
        return (-c / b,)

    d = b ** 2 - 4 * a * c
    if d > 0:
        x1 = float((-b + d ** 0.5) / (2 * a))
        x2 = float((-b - d ** 0.5) / (2 * a))
        return tuple(sorted([x1, x2]))
    elif d == 0:
        return (-b / (2 * a),-b / (2 * a))
    else:
        return ()


def Q19(A, B):
    """
    Multiply matrices A (m×n) and B (n×p).

    Parameters
    ----------
    A : list[list]
        First matrix.
    B : list[list]
        Second matrix.

    Returns
    -------
    list[list] or None
        Result matrix or None if shapes invalid.
    """
    if not A or not B:
        return None
    rowA = min([len(x) for x in A])
    if rowA != len(B):
        return None
    result = []
    for i in range(len(A)):
        row = []
        for j in range(len(B[0])):
            total = 0
            for k in range(len(A[0])):
                total += A[i][k] * B[k][j]
            row.append(total)
        result.append(row)
    return result

def Q20(n):
    """
    Compute prime factorization of n.

    Parameters
    ----------
    n : int
        Integer >= 2.

    Returns
    -------
    dict
        prime → exponent.
    """
    prime = {}
    for div in range(2, n + 1):
        while n % div == 0:
            prime[div] = prime.get(div, 0) + 1
            n //= div
    return prime

def Q21(n, k):
    """
    Compute the binomial coefficient C(n, k).

    Parameters
    ----------
    n : int
        Non-negative.
    k : int
        0 <= k <= n.

    Returns
    -------
    int
        C(n, k), or 0 if invalid.
    """
    if k > n or k < 0 or n < 0:
        return 0
    r1 = 1
    for i in range(1, n + 1):
        r1 = r1 * i

    r2 = 1
    for j in range(1, k + 1):
        r2 = r2 * j

    r3 = 1
    for m in range(1, (n - k) + 1):
        r3 = r3 * m
    return (r1 // (r2 * r3))


def Q22(s):
    """
    Check if s is a palindrome ignoring case and non-alphanumeric characters.

    Parameters
    ----------
    s : str
        Input string.

    Returns
    -------
    bool
        True if palindrome, else False.
    """
    str1 = [char.lower() for char in s if char.isalnum()]
    return str1 == str1[::-1]

def Q23(s, sub):
    """
    Count non-overlapping occurrences of substring sub in s.

    Parameters
    ----------
    s : str
        Full string.
    sub : str
        Substring.

    Returns
    -------
    int
        Count of non-overlapping occurrences.
    """
    count = 0
    i = 0
    if not sub:
        return 0
    while i <= len(s) - len(sub):
        if s[i: i + len(sub)] == sub:
            count += 1
            i += len(sub)
        else:
            i += 1
    return count

def Q24(s):
    """
    Run-length encode a string.

    Parameters
    ----------
    s : str
        Input string.

    Returns
    -------
    str
        Encoded form.
    """
    if not s:
        return ""
    result = ""
    count = 1
    for curr in range(1, len(s)):
        if s[curr] == s[curr - 1]:
            count += 1
        else:
            result += s[curr - 1] + str(count)
            count = 1
    result += s[-1] + str(count)
    return result


def Q25(s):
    """
    Convert camelCase or PascalCase string to snake_case.

    Parameters
    ----------
    s : str
        Input string.

    Returns
    -------
    str
        Converted snake_case string.
    """
    if not s:
        return ""
    ans = ""
    for c in range(len(s)):
        if s[c].isupper():
            if c > 0 and s[c - 1].islower():
                ans += "_" + s[c].lower()
            else:
                ans += s[c].lower()
        else:
            if c > 1 and s[c - 1].isupper() and s[c - 2].isupper():
                ans = ans[:-1] + "_" + ans[-1]
            ans += s[c]
    return ans.strip("_")

def Q26(a, b):
    """
    Determine whether two strings are anagrams, ignoring case and non‑letters.

    Parameters
    ----------
    a : str
        First input string.
    b : str
        Second input string.

    Returns
    -------
    bool
        True if a and b are anagrams, False otherwise.
    """
    if not a or not b:
        return False
    char1 = [c.lower() for c in a if c.isalnum()]
    char2 = [c.lower() for c in b if c.isalnum()]

    return (sorted(char1) == sorted(char2))


def Q27(lst, depth):
    """
    Flatten a nested list up to a given depth.

    Parameters
    ----------
    lst : list
        Possibly nested list.
    depth : int
        Levels of nesting to flatten. 0 returns a shallow copy.

    Returns
    -------
    list
        Partially or fully flattened list.
    """
    if lst == []:
        return []
    ans1 = lst
    curr_depth = 0
    while curr_depth < depth:
        newAns = []
        for i in ans1:
            if isinstance(i, list):
                newAns.extend(i)
            else:
                newAns.append(i)
        ans1 = newAns
        curr_depth += 1
    return ans1


def Q28(lst):
    """
    Remove duplicates while preserving first occurrence order.

    Parameters
    ----------
    lst : list
        Input list.

    Returns
    -------
    list
        Deduplicated list preserving order.
    """
    if lst == []:
        return []
    result = []
    repeated = []
    for i in lst:
        if i not in repeated:
            repeated.append(i)
            result.append(i)
    return result

def Q29(nums, k):
    """
    Compute sums of all contiguous windows of length k.

    Parameters
    ----------
    nums : list[int or float]
        Input numbers.
    k : int
        Window size.

    Returns
    -------
    list[int or float]
        Window sums, or empty list if k invalid.
    """
    if nums == [] or k > len(nums):
        return []
    ans2 = []
    for item in range(len(nums) - k + 1):
        others = nums[item: item + k]
        ans2.append(sum(others))
    return ans2


def Q30(items, f):
    """
    Group items by a key function f.

    Parameters
    ----------
    items : list
        Elements to group.
    f : callable
        Function mapping each item to a key.

    Returns
    -------
    dict
        key → list of items.
    """
    if items == []:
        return {}
    dic2 = {}
    for i in items:
        key = f(i)
        if key not in dic2:
            dic2[key] = []
        dic2[key].append(i)
    return dic2


def Q31(items, pred):
    """
    Partition items into two lists based on lambda pred.

    Parameters
    ----------
    items : list
        Input elements.
    pred : callable
        lambda function returning True or False.
        - a lambda function is a small, anonymous function that can take any number of arguments but can only have one expression

    Returns
    -------
    tuple[list, list]
        (items where pred is True, items where pred is False).
    """
    list1 = [i for i in items if pred(i)]
    list2 = [i for i in items if not pred(i)]
    return (list1, list2)

def Q32(n):
    """
    Return all prime numbers ≤ n

    Parameters
    ----------
    n : int
        Upper bound.

    Returns
    -------
    list[int]
        Primes up to n.
    """
    prime = []
    for i in range(2, n + 1):
        for div in range(2, i):
            if i % div == 0:
                break
        else:
            prime.append(i)
    return prime


def Q33(nums):
    """
    Compute the length of the longest strictly increasing subsequence.

    Parameters
    ----------
    nums : list[int or float]
        Input sequence.

    Returns
    -------
    int
        Length of LIS. 0 if nums is empty.
    """
    if not nums:
        return 0
    length = len(nums)
    n = [1] * length
    for i in range(length):
        for j in range(i):
            if nums[j] < nums[i]:
                n[i] = max(n[i], n[j] + 1)
    return max(n)

def Q34(arr, k):
    """
    Return the k-th smallest element (1-based) using Quickselect.

    Parameters
    ----------
    arr : list
        Input list.
    k : int
        1-based index of desired order statistic.

    Returns
    -------
    any or None
        k-th smallest element, or None if k out of range.
    """
    if not arr or k < 1 or k > len(arr):
        return None
    a = arr[0]
    lGrp = []
    mGrp = []
    rGrp = []
    for i in arr:
        if i < a:
            lGrp.append(i)
        elif i == a:
            mGrp.append(i)
        else:
            rGrp.append(i)
    if k <= len(lGrp):
        return Q34(lGrp, k)
    elif k <= len(lGrp) + len(mGrp):
        return a
    else:
        return Q34(rGrp, k - len(lGrp) - len(mGrp))

def Q35(coeffs, x):
    """
    Evaluate a polynomial at x using Horner's method.

    Parameters
    ----------
    coeffs : list[int or float]
        Polynomial coefficients [c0, c1, ..., cn].
    x : int or float
        Point of evaluation.

    Returns
    -------
    int or float
        Evaluated polynomial value.
    """
    if not coeffs:
        return 0
    a = coeffs[-1]
    for i in coeffs[-2::-1]:
        a = a * x + i
    return a


def Q36(intervals):
    """
    Merge overlapping or touching intervals.

    Parameters
    ----------
    intervals : list[list[int, int]]
        List of [start, end] intervals, unsorted.

    Returns
    -------
    list[list[int, int]]
        Sorted list of merged intervals.
    """
    if not intervals:
        return []
    intervals.sort()
    result = []
    start_point = intervals[0][0]
    end_point = intervals[0][1]
    for i in intervals[1:]:
        if i[0] <= end_point:
            end_point = max(end_point, i[1])
        else:
            result.append([start_point, end_point])
            start_point = i[0]
            end_point = i[1]
    result.append([start_point, end_point])
    return result

def Q37(s):
    """
    Check whether the brackets in a string are balanced.
    Only (), [], {} are considered; all other characters are ignored.

    Parameters
    ----------
    s : str
        Input string.

    Returns
    -------
    bool
        True if brackets are correctly balanced.
    """
    stack = []
    m = { ')' : '(', ']':'[','}':'{'}
    for c in s :
        if c in '([{':
            stack.append(c)
        elif c in m:
            if not stack or stack[-1] != m[c]:
                return False
            stack.pop()
    return len(stack) == 0


def Q38(graph, src, dst):
    """
    Compute shortest path length between src and dst using BFS.

    Parameters
    ----------
    graph : dict[Any, list[Any]]
        Adjacency list.
    src : Any
        Start node.
    dst : Any
        Destination node.

    Returns
    -------
    int or None
        Number of edges in shortest path, or None if unreachable.
    """
    if src == dst:
        return 0  # same node return 0
    start_node = [src]
    visited = {src}
    step = 0
    while start_node:
        ## 1st remove from front
        node = start_node.pop(0)
        ## 3nd look at friends
        for friend in graph[node]:
            ## 2nd check if its the target
            if friend not in visited:
                if friend == dst:
                    return step + 1
                start_node.append(friend)
                visited.add(friend)
        step += 1
    return None

def Q39(a, b):
    """
    Compute Levenshtein edit distance.

    Parameters
    ----------
    a : str
        First string.
    b : str
        Second string.

    Returns
    -------
    int
        Minimum edit operations required.
    """
    if a == b:
        return 0
    row = len(a) + 1
    col = len(b) + 1
    g = [[0] * col for i in range(row)]
    for i in range(row):
        g[i][0] = i
    for j in range(col):
        g[0][j] = j
    for i in range(1, row):
        for j in range(1, col):
            if a[i - 1] == b[j - 1]:
                g[i][j] = g[i - 1][j - 1]
            else:
                g[i][j] = 1 + min(
                    g[i - 1][j - 1],
                    g[i][j - 1],
                    g[i - 1][j]
                )
    return g[row - 1][col - 1]


def Q40(matrix):
    """
    Return the elements of a 2D matrix in clockwise spiral order.

    Parameters
    ----------
    matrix : list[list]
        2D matrix (may be non-square).

    Returns
    -------
    list
        Spiral traversal of matrix.
    """
    if not matrix:
        return []
    top = 0
    left = 0
    right = len(matrix[0]) - 1
    bottom = len(matrix) - 1
    r = []
    while top <= bottom and left <= right:
        for i in range(left, right + 1):
            r.append(matrix[top][i])
        top += 1
        for i in range(top, bottom + 1):
            r.append(matrix[i][right])
        right -= 1
        if top <= bottom:
            for i in range(right, left - 1, -1):
                r.append(matrix[bottom][i])
            bottom -= 1
        if left <= right:
            for i in range(bottom, top - 1, -1):
                r.append(matrix[i][left])
            left += 1
    return r



