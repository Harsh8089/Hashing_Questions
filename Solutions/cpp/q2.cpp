#include <iostream>
#include <unordered_map>
#include <string>
#include <algorithm>

using namespace std;

int findMaxLength(const string& s) {
    unordered_map<int, int> balanceMap;
    balanceMap[0] = -1; 
    int maxLength = 0, balance = 0;

    for(int i = 0; i < s.length(); ++i) {

        if(s[i] == '1') balance++;
        else if(s[i] == '0') balance--;

        if(balanceMap.find(balance) != balanceMap.end()) {
            maxLength = max(maxLength, i - balanceMap[balance]);
        } 
        else balanceMap[balance] = i;
    }

    return maxLength;
}

int main() {
    string s;
    cin >> s;

    int maxLength = findMaxLength(s);
    if(maxLength == 0) cout << -1 << endl;
    else cout << s.size() - maxLength << endl;

    return 0;
}

// TC - O(n)
// SC - O(n)