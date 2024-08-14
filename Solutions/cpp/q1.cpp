#include <bits/stdc++.h>

using namespace std;

vector<int> findMinCostServer(int &n1, int &n2, vector<int> &serverLoad, vector<int> &serverCapacity) {
    // Never change the input array in an interview. Bad practice !!. Hence creating a copy :)
    vector<int> copy_of_capacity = serverCapacity;
    vector<int> copy_of_load = serverLoad;

    sort(copy_of_capacity.begin(), copy_of_capacity.end(), greater<int> ());

    sort(copy_of_load.begin(), copy_of_load.end());

    map<int, vector<int>> hashMap;
    map<int, vector<int>> mapIdx;
    for(int i = 0; i < n1; i++) {
        hashMap[copy_of_load[i]].push_back(copy_of_capacity[i]);
        mapIdx[serverLoad[i]].push_back(i);
    }

    vector<int> ans(n2);

    for(auto it : hashMap) {
        vector<int> elements = it.second;
        // Since problem statement has mentioned to return lexicographically smallest.
        sort(elements.begin(), elements.end());

        vector<int> idx = mapIdx[it.first];
        for(int k = 0; k < idx.size(); k++) {
            ans[idx[k]] = elements[k];
        }
    }

    return ans;

}

int main() {
    int n1, n2;
    cin >> n1 >> n2;

    vector<int> serverLoad;
    for(int i = 0; i < n1; i++) {
        int d; cin >> d;
        serverLoad.push_back(d);
    }    

    vector<int> serverCapacity;
    for(int i = 0; i < n2; i++) {
        int d; cin >> d;
        serverCapacity.push_back(d);
    }  

    vector<int> sequence = findMinCostServer(n1, n2, serverLoad, serverCapacity);
    for(int i = 0; i < n2; i++) {
        cout << sequence[i] << " ";
    }

    cout << "\n";

    return 0;
}
 