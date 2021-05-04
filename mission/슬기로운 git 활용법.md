슬기로운 git 활용법
=================
팀 브랜치 가져오기
-----------------

1. NEXTSTEP에서 A가 새로운 브랜치를 생성하여 로컬에서 기능 구현을 진행함

2. NEXTSTEP에서 B도 fork한  후에, 로컬에서 다음 코드를 실행 후 A의 원격 저장소를 추가한다.

- orgine: NEXTSTEP과 A의 원격 저장소를 가지게 됨.

```text
git remote add {https://github.com/Data-ssung}.미션이름.git}


// git 명령어 
git remote add pair https://github.com/{페어_아이디}/{저장소_아이디}.git
git remote -v
origin	https://github.com/{본인_아이디}/{저장소_아이디}.git (fetch)
origin	https://github.com/{본인_아이디}/{저장소_아이디}.git (push)
pair	https://github.com/{페어_아이디}/{저장소_아이디}.git (fetch)
pair	https://github.com/{페어_아이디}/{저장소_아이디}.git (push)
git fetch pair {브랜치_이름}
git checkout -t pair/{브랜치_이름}
git push origin {브랜치_이름}
``` 

3. B가 A한테 해당 브랜치를 pull, push 한다. 