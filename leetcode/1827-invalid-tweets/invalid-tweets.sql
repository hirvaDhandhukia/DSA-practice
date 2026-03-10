select tweet_id from Tweets 

-- where length(content) > 15;
where char_length(content) > 15