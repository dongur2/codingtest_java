
# 시간 복잡도(Time Complexity)
코드 or 알고리즘의 실행 시간과 데이터의 상관관계

<br>

## 빅오(Big-O) 표기법
알고리즘이 겪을 수 있는 **최악의 경우에 걸리는 시간**과 **입력 데이터** 간의 상관관계를 표시
- N: 입력 크기
- O(N): 입력 크기에 비례하는 시간 소요
- **실행 시간에 가장 큰 영향을 미치는 항**만 표기
<br>

- 알고리즘과 시간 복잡도
  |알고리즘|시간 복잡도|
  |------|---|
  |이진 탐색|O(logN)|
  |선형 탐색|O(N)|
  |정렬|O(N logN)|
  |조합|O(2^N)|
  |순열|O(N!)|
  - 특별한 로직 없이 실행되는 단순 연산: O(1) - 상수 시간

<br>

> [1초 기준] 입력 조건에서 명시된 최악의 경우를 시간 복잡도에 대입했을 때 *1억*이 넘지 않는다면, 실행 시간이 1초보다 빠른 효율적인 코드일 가능성이 높다.
시간 제한이 없을 지라도, 코드 대부분은 10초 이내에 실행 완료되어야 하므로, 만약 시간 복잡도가 10억을 초과한다면 다른 풀이를 고민할 필요가 있다.


효율적인 문제 풀이: 풀이 생각 -> 효율성 검증(시간 복잡도) -> 작성

<br>

## 시간 복잡도 계산

기본: 반복 횟수 - 반복문이 어떤 값에 비례하여 반복되는지 따져 계산


- 시간 복잡도는 정확한 실행 시간을 계산하는 용도가 아니므로, **곱하거나 더해지는 상수 부분**은 미표시
