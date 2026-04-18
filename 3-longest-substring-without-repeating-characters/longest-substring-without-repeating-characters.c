int lengthOfLongestSubstring(char* s) {
    // freq array will store how many times each character appears in the current window
    // We set all 256 slots to 0 at the beginning (clean slate)
    int freq[256] = {0};  
    
    // l = left pointer, r = right pointer, maxLen = result we want
    int l = 0, r = 0, maxLen = 0;

    // Loop until the end of the string (C strings end with '\0')
    while (s[r] != '\0') {
        
        // Step 1: Add the current character s[r] into our window
        freq[s[r]]++;   // increase count of that character
        
        // Step 2: If this character appears more than once -> duplicate found
        // Keep removing characters from the left until duplicate is gone
        while (freq[s[r]] > 1) {
            freq[s[l]]--;  // remove the leftmost character from window
            l++;           // move left pointer to the right
        }

        // Step 3: Now window [l...r] has all unique characters
        int winLen = r - l + 1;   // window length = right - left + 1

        // Step 4: Update answer if this window is the biggest so far
        if (winLen > maxLen) {
            maxLen = winLen;
        }

        // Step 5: Move right pointer to expand window
        r++;
    }

    // Finally return the maximum length found
    return maxLen;
}