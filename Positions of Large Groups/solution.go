package main

func largeGroupPositions(S string) [][]int {
	result := [][]int{}
	start := 0
	for i := 0; i < len(S); i++ {
		if i == len(S)-1 || S[i] != S[i+1] {
			if i-start >= 2 {
				result = append(result, []int{start, i})
			}
			start = i + 1
		}
	}
	return result
}
