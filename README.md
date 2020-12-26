# Algorism-Study

1. 서로가 공부한 내용을 목록/닉네임을 branch를 만들어서 1주일 단위로 풀었던 알고리즘 코드를 올린다.      
EX- 알고리즘기초/Seongeun

2. 각 문제마다 Readme.md에 간단한 평을 적는다. (접근방법, 문제풀이 등)
 
# 깃헙 관리하는 방법            
github에 가입한 이메일에서 join           

git config --global user.name "ahnseongeun"          
git config --global user.email "ahnseongeun@test.com"              

#EX) 브런치 생성해서 push하기        
cd 관리할 폴더        
git clone https://github.com/Algorism-study/study.git .        
git branch 알고리즘기초/TEST        
git checkout 알고리즘기초/TEST        
git push --set-upstream origin 알고리즘기초/TEST        
기존의 관리하던 폴더를 새로 생성한 관리할 폴더로 이동       
git init       
git add .        
git commit -m "test1"        
git push origin 알고리즘기초/TEST           
*항상 브런치 확인후 push 하기*                         
