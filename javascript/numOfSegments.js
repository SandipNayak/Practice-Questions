// You are given a string s, return the number of segments in the string.

// A segment is defined to be a contiguous sequence of non-space characters.

// Example 1:

// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
// Example 2:

// Input: s = "Hello"
// Output: 1
// Example 3:

// Input: s = "love live! mu'sic forever"
// Output: 4
// Example 4:

// Input: s = ""
// Output: 0

// Constraints:

// 0 <= s.length <= 300
// s consists of lower-case and upper-case English letters, digits or one of the following characters "!@#$%^&*()_+-=',.:".
// The only space character in s is ' '.

var countSegments = function (s) {
  s = s.trim();
  let result = [];
  let str = "";
  for (let i = 0; i < s.length; i++) {
    s.rep;
    if (s.charCodeAt(i) != 32) {
      str += s[i];
    } else {
      if (str != "") result.push(str);
      str = "";
    }
  }
  if (str) result.push(str);
  return result.length;
};
