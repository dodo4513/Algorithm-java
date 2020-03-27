# 유용한 메서드들

## map

.keySet()
.values()

.computeIfAbsent(key, (key) ->)
.computeIfPresent(key, (key, value) -> )
.getOrDefault
map.merge(rank, 1, Integer::sum);

# Queue

Queue<Integer> queue = new LinkedList<>();
PriorityQueue

.offer, .add
.poll
.peek
.isEmpty

# Deque

# String

.toCharArray
String.join("", array)

# Stream

.stream().collect(Collectors.joining())

