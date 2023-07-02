#include <bits/stdc++.h>
using namespace std;

void revWords(string s){
    vector<string> tmp;
    string str = " ";
    for(unsigned int i=0;i<s.length();i++){
        if(s[i]==' '){
            tmp.push_back(str);
            str = "";
        }
        else str+=s[i];
    }
    tmp.push_back(str);
    int i;
    for(i=tmp.size()-1;i>0;i--) cout << tmp[i] << " ";
    cout << tmp[0] << endl;
}

int main(){
    string s = "this is just a test";
    revWords(s);
    return 0;
}