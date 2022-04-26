Set-Location $PSScriptRoot
[System.Collections.ArrayList]$mentors = Get-Content ../mentors.txt
[System.Collections.ArrayList]$participants = Get-Content ../participants.txt

$assignments = @{}
foreach ($mentor in $mentors) {
    $assignments += @{$mentor = @() }
}

while ($participants.Count -gt 0) {
    foreach ($mentor in $mentors) {
        $indexToAssign = Get-Random -Minimum 0 -Maximum $participants.Count
        $assignments[$mentor] += $participants[$indexToAssign]
        $participants.RemoveAt($indexToAssign)
    }
    $participantsUnassigned = $mentors.Count - $participants.Count
    for ($i = 1; $i -le $participantsUnassigned; $i++) {
        $mentors.RemoveAt((Get-Random -Minimum 0 -Maximum $mentors.Count))
    }
}
$assignmentsAsJson = ConvertTo-Json -InputObject $assignments
Out-File -FilePath ../assignments.json -InputObject $assignmentsAsJson