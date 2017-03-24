# Get argument from command line.  If argument cannot be parsed, will just
# return 0
max = ARGV[0].to_i

# Make primes a new array
primes = []

# All values in array are by default nil (kind of like "null" in Java)
# We set all of the values from 2 to the end equal to true as we assume all
# values are prime pre-sieve
(2..max).each { |x| primes[x] = true }

# The sieve itself. For each value from 2 to sqrt(max), set any multiples
# of that value (up to the size of the array equal to 
(2..(Math.sqrt(max).ceil)).each { |x| (x**2..max).step(x) { |c| primes[c] = nil}  if primes[x] }

# .each_with_index is kind of like a for loop here - x stores the value, index is a counter
# like the j in for (int j = 0; ..).  Print out the index value if the value stored
# at that location (primes[index]) is not nil (all values in our primes array should be
# either nil or true)
primes.each_with_index { |x, index| puts "#{index} is a prime!" unless x.nil? }
