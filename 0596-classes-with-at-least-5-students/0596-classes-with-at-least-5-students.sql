SELECT class FROM (SELECT class,count(*) AS freq 
                  FROM Courses 
                  GROUP BY class HAVING freq) AS t WHERE t.freq>=5;
