-- Create main application user with full database access
GRANT ALL PRIVILEGES ON sb3t0.* TO 'sb3t0'@'%';

-- Reload privileges
FLUSH PRIVILEGES;