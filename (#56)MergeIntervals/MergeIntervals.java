class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() <= 1) return intervals;
        intervals.sort((l1, l2) -> Integer.compare(l1.start, l2.start));
        
            
        List<Interval> list = new ArrayList<Interval>();
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(Interval interval : intervals){
            if(interval.start <= end)
                end = Math.max(end, interval.end);
            else{
                list.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        list.add(new Interval(start, end));// Add the last interval
        return list;
    }
}